const arr = ['India', 'Hindustan', 'Bharat']

let options = ''

function addOptions()
{
    arr.map(function(current) {
        options += '<option>'+current+'</option>'
    })

    document.getElementById('dropdown_list').innerHTML = options
}