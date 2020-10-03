let i = 0;
let total;
const listid = [],
  listname = [],
  listprice = [],
  listquantity = [];
function addPrice() {
  let eventid = document.getElementById("eventId");
  let eventname = document.getElementById("eventName");
  let eventprice = document.getElementById("price");
  let id = document.getElementById("eventIdPara");
  let name = document.getElementById("eventNamePara");
  let price = document.getElementById("pricePara");
  if (
    eventid.value !== "" &&
    eventname.value !== "" &&
    eventprice.value !== ""
  ) {
    id.innerHTML = "";
    name.innerHTML = "";
    price.innerHTML = "";
    listquantity.push(1);
    document.getElementById("tablehead").innerHTML =
      "<tr><th>ID</th><th>Product Name</th><th>Price</th><th>Quantity</th><th>Remove from Cart</th></tr>";
    document.getElementById("tablebody").innerHTML = "";
    listid[i] = document.getElementById("eventId").value;
    listname[i] = document.getElementById("eventName").value;
    listprice[i] = document.getElementById("price").value;
    for (let j = 0; j < listid.length; j++) {
      document.getElementById("tablebody").innerHTML +=
        "<tr><td style='text-align:center;'>" +
        listid[j] +
        "</td><td>" +
        listname[j] +
        "</td><td>" +
        listprice[j] +
        '</td><td><input onchange="quantity(this.id)" id="select' +
        j +
        '" type="number" value="' +
        listquantity[j] +
        '" min="1"></td><td><a href="#" onclick="remove(this.id)" id="link' +
        j +
        '">Remove</a></td></tr>';
    }
    document.getElementById("eventId").value = "";
    document.getElementById("eventName").value = "";
    document.getElementById("price").value = "";
    document.getElementById("total").value = "";
    total = 0;
    for (let k = 0; k < listid.length; k++) {
      total += parseInt(listprice[k]) * listquantity[k];
    }
    if (total === 0) {
      document.getElementById("total").innerHTML = "";
    } else {
      document.getElementById("total").innerHTML = "The total cost is " + total;
    }
    i++;
  } else {
    if (eventid.value === "") {
      id.innerHTML = "*Required";
    } else {
      id.innerHTML = "";
    }
    if (eventname.value === "") {
      name.innerHTML = "*Required";
    } else {
      name.innerHTML = "";
    }
    if (eventprice.value === "") {
      price.innerHTML = "*Required";
    } else {
      price.innerHTML = "";
    }
  }
}
function remove(id) {
  let rowNumber = parseInt(id.slice(-1));
  listid.splice(rowNumber, 1);
  listname.splice(rowNumber, 1);
  listprice.splice(rowNumber, 1);
  listquantity.splice(rowNumber, 1);
  if (listprice.length === 0) {
    document.getElementById("tablehead").innerHTML = "";
  } else {
    document.getElementById("tablehead").innerHTML =
      "<tr><th>ID</th><th>Product Name</th><th>Price</th><th>Quantity</th><th>Remove from Cart</th></tr>";
  }
  document.getElementById("tablebody").innerHTML = "";
  for (let j = 0; j < listid.length; j++) {
    document.getElementById("tablebody").innerHTML +=
      "<tr><td style='text-align:center;'>" +
      listid[j] +
      "</td><td>" +
      listname[j] +
      "</td><td>" +
      listprice[j] +
      '</td><td><input onchange="quantity(this.id)" id="select' +
      j +
      '" type="number" value="' +
      listquantity[j] +
      '" min="1"></td><td><a href="#" onclick="remove(this.id)" id="link' +
      j +
      '">Remove</a></td></tr>';
  }
  document.getElementById("total").value = "";
  total = 0;
  for (let k = 0; k < listid.length; k++) {
    total += parseInt(listprice[k]) * listquantity[k];
  }
  if (total === 0) {
    document.getElementById("total").innerHTML = "";
  } else {
    document.getElementById("total").innerHTML = "The total cost is " + total;
  }
  i--;
}
function quantity(idno) {
  let idNumber = parseInt(idno.slice(-1));
  listquantity[idNumber] = document.getElementById(idno).value;
  total = 0;
  for (let k = 0; k < listid.length; k++) {
    total += parseInt(listprice[k]) * listquantity[k];
  }
  if (total === 0) {
    document.getElementById("total").innerHTML = "";
  } else {
    document.getElementById("total").innerHTML = "The total cost is " + total;
  }
}
