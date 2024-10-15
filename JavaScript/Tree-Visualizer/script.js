const point1 = document.getElementsByClassName('point')[0]
const point2 = document.getElementsByClassName('point')[1]
const line = document.getElementsByClassName('line')[0]

// Find the points based off the elements left and top
var p1 = {x: point1.offsetLeft, y: point1.offsetTop};
var p2 = {x: point2.offsetLeft, y: point2.offsetTop};

// Get distance between the points for length of line
var a = p1.x - p2.x;
var b = p1.y - p2.y;
var length = Math.sqrt( a*a + b*b );

// Get angle between points
var angleDeg = Math.atan2(p2.y - p1.y, p2.x - p1.x) * 180 / Math.PI;

// Get distance from edge of point to center
var pointWidth = point1.clientWidth / 2;
var pointHeight = point1.clientWidth / 2;

// Set line distance and position
// Add width/height from above so the line starts in the middle instead of the top-left corner
line.style.width = length + 'px';
line.style.left = (p1.x + pointWidth)+ 'px';
line.style.top = (p1.y + pointHeight) + 'px';

// Rotate line to match angle between points
line.style.transform = "rotate(" + angleDeg + "deg)";

const point3 = document.getElementsByClassName('point')[2]
const line1 = document.getElementsByClassName('line')[1]

// Find the points based off the elements left and top
var p1 = {x: point1.offsetLeft, y: point1.offsetTop};
var p2 = {x: point3.offsetLeft, y: point3.offsetTop};

// Get distance between the points for length of line1
var a = p1.x - p2.x;
var b = p1.y - p2.y;
var length = Math.sqrt(a*a + b*b);

// Get angle between points
var angleDeg = Math.atan2(p2.y - p1.y, p2.x - p1.x) * 180 / Math.PI;

// Get distance from edge of point to center
var pointWidth = point1.clientWidth / 2;
var pointHeight = point1.clientWidth / 2;

// Set line1 distance and position
// Add width/height from above so the line1 starts in the middle instead of the top-left corner
line1.style.width = length + 'px';
line1.style.left = (p1.x + pointWidth)+ 'px';
line1.style.top = (p1.y + pointHeight) + 'px';

// Rotate line1 to match angle between points
line1.style.transform = "rotate(" + angleDeg + "deg)";