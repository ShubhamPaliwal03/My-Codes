const table_headings = ["First Name", "Last Name", "Roll Number", "Branch", "Year", "Phone Number"];

const body = document.querySelector('body');

const generateForm = (() => {

    const form_container = document.getElementById('form-container');

    table_headings.forEach(fieldName => {

        const div = document.createElement('div');

        const label = document.createElement('label');
        label.innerText = fieldName;

        const input = document.createElement('input');
        input.type = "text";

        label.appendChild(input);

        div.appendChild(label);

        form_container.appendChild(div);
    });

    const div = document.createElement('div');

    const btn = document.createElement('input');
    btn.type = "button";
    btn.id = "add-record-btn";
    btn.value = "Add Record";

    div.appendChild(btn);

    form_container.appendChild(div);

})(); // IIFE

const addRecordBtn = document.getElementById('add-record-btn');

const addRecords = () => {

    const formInputValues = Array.from(document.querySelectorAll("#form-container > div > label > input")).map((inputField) => {

    const inputFieldValue = inputField.value;

    inputField.value = "";

    return inputFieldValue;
    });

    let records_table = document.getElementById('records-table');

    // if no records table exists currently, make a new one

    if (document.getElementById('records-table') === null) {

    records_table = document.createElement('table');
    records_table.id = "records-table";

    const tr1 = document.createElement('tr');

    for (const table_heading of table_headings) {

        const th = document.createElement('th');
        th.innerText = table_heading;

        tr1.appendChild(th);
    }

    records_table.appendChild(tr1);

    body.appendChild(records_table);

    } else {

        records_table = document.getElementById('records-table');
    }

    const tr = document.createElement('tr');

    formInputValues.forEach(fieldValue => {

        const td = document.createElement('td');
        td.innerText = fieldValue;

        tr.appendChild(td);
    });

    records_table.appendChild(tr);
}

addRecordBtn.addEventListener('click', addRecords);