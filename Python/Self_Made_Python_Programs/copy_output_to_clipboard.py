import pyperclip as pp

pp.copy(pp.paste().replace(" ", "_"))

# paste the string from clipboard, and replace all the empty spaces " " with "_", then copy it back to the clipboard