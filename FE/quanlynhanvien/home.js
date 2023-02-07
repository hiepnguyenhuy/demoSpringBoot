function showEmployee() {
    $.ajax({
        type: "GET",
        headers: {
            'Accept': 'application/json'
        },
        url: "http://localhost:8080/employees",
        //xử lý khi thành công
        success: function (employees) {
            console.log(employees)
            let str = '';
            for (const e of employees) {
                str += `<div class="col-sm-4">
                        <h2>${e.name}</h2>
                        <h2>${e.code}</h2>
                        <h2>${e.age}</h2>
                        <h2>${e.salary}</h2>
                        <h2>${e.branch}</h2>
                        <a type="button" class="btn btn-warning" onclick="showEdit(${e.id})" data-toggle="modal" data-target="#myModal">Edit</a>
                        <a type="button" class="btn btn-danger" >Delete</a>
                        </div>`
            }
document.getElementById("showEmployee").innerHTML = str;
        },
        error: function (err) {
            console.log(err)
        }
    })
}
showEmployee();