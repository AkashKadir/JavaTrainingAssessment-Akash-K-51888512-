const eventNames = [];
let sortcount;
function addEvent() {
  sortcount = 0;
  const names = document.getElementById("eventName").value;
  if (eventNames.length === 0) {
    if (names === "") {
      document.getElementById("successMessage").innerHTML = "";
    } else {
      eventNames.push(names);
      document.getElementById("successMessage").innerHTML =
        "Event name added successfully";
    }
  } else {
    let count = 0;
    for (let i = 0; i < eventNames.length; i++) {
      if (eventNames[i] === names) count++;
    }
    if (count === 0) {
      if (names === "") {
        document.getElementById("successMessage").innerHTML = "";
      } else {
        eventNames.push(names);
        document.getElementById("successMessage").innerHTML =
          "Event name added successfully";
      }
    } else {
      document.getElementById("successMessage").innerHTML =
        "Event name already exists. Try with someother name.";
    }
  }
  document.getElementById("listheader").innerHTML = "";
  document.getElementById("eventList").innerHTML = "";
  document.getElementById("label").innerHTML = "";
  document.getElementById("eventName").value = "";
  sortcount++;
}
function sort() {
  if (sortcount > 0) {
    eventNames.sort();
    document.getElementById("successMessage").innerHTML = "";
    if (eventNames.length === 0) {
      document.getElementById("listheader").innerHTML = "";
    } else {
      document.getElementById("eventName").value = "";
      let header = document.getElementById("listheader");
      header.innerHTML = "The Event name after sorting is";
      for (let i = 1; i <= eventNames.length; i++) {
        let rows = document.getElementById("eventList");
        rows.innerHTML += "<li>" + eventNames[i - 1] + "</li>";
      }
      document.getElementById("label").innerHTML = "";
    }
  }
  sortcount = 0;
}
document.getElementById("eventName").addEventListener("click", function () {
  document.getElementById("label").innerHTML = "Enter the Event Name";
  document.getElementById("successMessage").innerHTML = "";
});
