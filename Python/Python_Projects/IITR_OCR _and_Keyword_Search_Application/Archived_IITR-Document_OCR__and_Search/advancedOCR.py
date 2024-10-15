import torch
from PIL import Image
from transformers import AutoModel, AutoTokenizer
import streamlit as st

# Load the model and tokenizer
model = AutoModel.from_pretrained('openbmb/MiniCPM-V-2_6', trust_remote_code=True, 
                                  attn_implementation='sdpa', torch_dtype=torch.bfloat16).eval().cuda()
tokenizer = AutoTokenizer.from_pretrained('openbmb/MiniCPM-V-2_6', trust_remote_code=True)

# Function to perform OCR using MiniCPM
def perform_ocr(image, question):
    msgs = [{'role': 'user', 'content': [image, question]}]
    res = model.chat(image=None, msgs=msgs, tokenizer=tokenizer)
    return res

# Streamlit UI
st.title("OCR and Document Search Web Application")
st.write("This application extracts English and Hindi text from an uploaded image and allows for keyword search within the extracted text.")

# Image upload
uploaded_file = st.file_uploader("Upload an image containing text in Hindi and/or English", type=["jpg", "png", "jpeg"])

if uploaded_file is not None:
    # Display the uploaded image
    image = Image.open(uploaded_file).convert("RGB")
    st.image(image, caption='Uploaded Image', use_column_width=True)
    
    # Perform OCR on the image
    st.write("Extracting text from the image...")
    question = "Detect and extract English or Hindi (whichever present, or both) language text from the image. Return me English or Hindi (whichever present, or both) language text from the image in English or Hindi Script respectively"
    
    try:
        extracted_text = perform_ocr(image, question)
        st.write("Extracted Text:")
        st.write(extracted_text)
        
        # Search functionality
        st.write("Enter a keyword to search within the extracted text:")
        keyword = st.text_input("Search Keyword")
        
        if keyword:
            if keyword.lower() in extracted_text.lower():
                st.success(f"Keyword '{keyword}' found in the extracted text.")
            else:
                st.error(f"Keyword '{keyword}' not found in the extracted text.")
    
    except Exception as e:
        st.error(f"An error occurred during OCR: {e}")

# import torch
# from PIL import Image
# from transformers import AutoModel, AutoTokenizer

# model = AutoModel.from_pretrained('openbmb/MiniCPM-V-_6', trust_remote_code=True,
#     attn_implementation = 'sdpa', torch_dtype=torch.bfloat16) # sdpa or flash_attention_2, no eager

# model = model.eval().cuda()

# tokenizer = Autotokenizer.from_pretrained('openbmb/MiniCPM-V-_6', trust_remote_code=True)

# image = Image.open(image_path).convert('RGB')

# question = "Detect and extract English or Hindi (whichever present, or both) language text from the image. Return me English or Hindi (whichever present, or both) language text from the image in English or Hindi Script respectively"

# msgs = [{'role' : 'user', 'content' : [image, question]}]

# res = model.chat(image=None, msgs=msgs, tokenizer=tokenizer)

# print(res)