import easyocr
import gradio as gr

def perform_ocr(image_path):

    reader = easyocr.Reader(['en'])

    result = reader.readtext(image_path)

    extracted_text = " ".join([text[1] for text in result])

    return extracted_text

def ocr_from_image(image):

    text = perform_ocr(image)
    return text

def search_text(image, keyword):

    text = perform_ocr(image)

    if keyword.lower() in text.lower():

        return f'Keyword "{keyword}" found!'

    else:

        return f'Keyword "{keyword}" not found.'

if __name__ == "__main__":

    interface = gr.Interface(fn=search_text, inputs=["image", "text"], outputs="text")

    interface.launch(share='true')


# if __name__ == "__main__":

#     path = './sample_image_3.png'

#     print(perform_ocr(path))