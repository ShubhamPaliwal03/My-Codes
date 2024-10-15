import easyocr
import streamlit as st
from PIL import Image

def perform_ocr(image_path):

    reader = easyocr.Reader(['en'])

    result = reader.readtext(image_path)

    extracted_text = " ".join([text[1] for text in result])

    return extracted_text

def main():

    st.title("OCR and Document Search")

    uploaded_file = st.file_uploader("Choose an image...", type="jpg")
    
    if uploaded_file is not None:

        image = Image.open(uploaded_file)

        st.image(image, caption='Uploaded Image.', use_column_width=True)

        st.write("")

        st.write("Extracting text...")

        text = perform_ocr(uploaded_file)
        
        st.write(text)
        
        keyword = st.text_input("Enter keyword to search")

        if st.button("Search"):

            if keyword.lower() in text.lower():

                st.success(f'Keyword "{keyword}" found!')

            else:

                st.error(f'Keyword "{keyword}" not found.')

if __name__ == '__main__':
    main()