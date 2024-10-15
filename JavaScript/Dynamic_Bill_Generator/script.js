const select_product = document.getElementById('select_product');
const select_quantity = document.getElementById('select_quantity');
const bill_amount_field = document.getElementById('bill_amount');

const calculateBill = () => {

    const price = select_product.value;
    const qty = select_quantity.value;

    bill_amount_field.value = price * qty;
};

select_product.addEventListener('change', calculateBill);
select_quantity.addEventListener('change', calculateBill);