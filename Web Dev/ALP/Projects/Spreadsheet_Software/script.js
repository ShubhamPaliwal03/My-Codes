const grid = [...document.getElementsByClassName('grid')][0];
const row_boxes = [...document.getElementsByClassName('rows_box')];
const cell_name_row_box = row_boxes[0];

for(let i = 65; i <= 90; i++) {

    const box_code = String.fromCharCode(i);

    const row_box = document.createElement("div");
    row_box.className = "cell";
    row_box.innerHTML = box_code;

    cell_name_row_box.appendChild(row_box);
}

for(let i = 1; i <= 100; i++) {

    const top_row = document.createElement('div');
    top_row.className = "top-row";

    const top_left = document.createElement('div');
    top_left.className = "top_left";
    top_left.innerHTML = i;

    const rows_box = document.createElement('div');
    rows_box.className = "rows_box";

    for(let j = 1; j <= 26; j++) {

        const cell = document.createElement("input");
        cell.className = "cell";

        rows_box.appendChild(cell);
    }

    top_row.appendChild(top_left);
    top_row.appendChild(rows_box);
    grid.appendChild(top_row);

}