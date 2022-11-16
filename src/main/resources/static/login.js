
function postUsers() {

    var login = new XMLHttpRequest()
    login.open('GET', "http://localhost:8081/rest/post", false)

    login.onreadystatechange = function() {
        if (login.readyState != 4) return;

    if (login.status != 200) {
        // обработать ошибку
        alert(login.status + ': ' + login.statusText); // пример вывода: 404: Not Found
    } else {
        try {
            var users = JSON.parse(login.responseText)
        } catch (e){
            alert(" ")
        }
        showUsers(users)
    }

    }
    login.send()
}
function showUsers(users) {

    users.forEach(function(users) {
        var li = list.appendChild(document.createElement('li'));
        li.innerHTML = users.login + ' ' + users.password;
    });

}




