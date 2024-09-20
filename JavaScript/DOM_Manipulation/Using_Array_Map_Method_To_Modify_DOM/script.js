const paragraphs = Array.from(document.getElementsByClassName('modified'));

// we can use Array.from() or spread operator to convert the HTMLCollection of elements which is returned by the getElementsByClassName() function

// getElementsByClassName() Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.

paragraphs.map((current) => {

    current.innerHTML = "<strong>This is modified text.<strong>";
});