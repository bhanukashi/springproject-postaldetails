function getPinCode () {
    var request = new XMLHttpRequest()

    var area = document.getElementById("areaText").value
    var district = document.getElementById("districtText").value

    var url

    if (null == district) {
        url = '/getPinCode/?area=' + area
    }
    else {
        url = '/getPinCode/?area=' + area + "&district=" + district
    }

    // Open a new connection, using the GET request on the URL endpoint
    request.open('GET', url, true)

    var table = document.getElementById("myTable")
    table.innerHTML = ""

    request.onload = function () {
        // Begin accessing JSON data here   
        var response = JSON.parse(this.response)
        for (var i = response.length - 1; i >= 0; i--) {
            var row = table.insertRow(0);
            var cell1 = row.insertCell(0);
            cell1.innerHTML = response[i]
        }
    }

    request.send()
}

function getPostOfficeNames() {
    var request = new XMLHttpRequest()

    var pin = document.getElementById("pinCodeText").value
    var url = '/getPostOfficeNames/?pinCode=' + pin

    // Open a new connection, using the GET request on the URL endpoint
    request.open('GET', url, true)

    var table = document.getElementById("myTable")
    table.innerHTML = ""

    request.onload = function () {
        // Begin accessing JSON data here
        var response = JSON.parse(this.response)
        for (var i = response.length - 1; i >= 0; i--) {
            var row = table.insertRow(0);
            var cell1 = row.insertCell(0);
            cell1.innerHTML = response[i]
        }
    }

    request.send()
}