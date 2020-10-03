const eventNames = [];
let displayEventCount;
function addEvent() {
  displayEventCount = 0;
  document.getElementById("tableHeader").innerHTML = "";
  document.getElementById("tableHeader").style.backgroundColor = "";
  document.getElementById("resultBody").innerHTML = "";
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
  document.getElementById("label").innerHTML = "";
  document.getElementById("eventName").value = "";
  displayEventCount++;
}
function displayEvent() {
  if (displayEventCount > 0) {
    document.getElementById("successMessage").innerHTML = "";
    if (eventNames.length === 0) {
      document.getElementById("tableHeader").innerHTML = "";
    } else {
      document.getElementById("eventName").value = "";
      let header = document.getElementById("tableHeader");
      header.style.backgroundColor = "#278ea5";
      header.style.color = "white";
      header.innerHTML = "EVENTS";
      for (let i = 1; i <= eventNames.length; i++) {
        let rows = document.getElementById("resultBody");
        rows.style.backgroundColor = "white";
        rows.innerHTML += "<tr><td>" + eventNames[i - 1] + "</td></tr>";
      }
      document.getElementById("label").innerHTML = "";
    }
  }
  displayEventCount = 0;
}
document.getElementById("eventName").addEventListener("click", function () {
  document.getElementById("label").innerHTML = "Enter the Event Name";
  document.getElementById("successMessage").innerHTML = "";
});
