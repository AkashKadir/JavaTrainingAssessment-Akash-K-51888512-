const eventNames = [];
let displaycount;
function pushElements() {
  displaycount = 0;
  const names = document.getElementById("input").value;
  if (eventNames.length === 0) {
    if (names === "") {
      document.getElementById("events").innerHTML = "";
    } else {
      eventNames.push(names);
      document.getElementById("events").innerHTML = "Added successfully";
    }
  } else {
    if (names === "") {
      document.getElementById("events").innerHTML = "";
    } else {
      let count = 0;
      for (let i = 0; i < eventNames.length; i++) {
        if (eventNames[i] === names) count++;
      }
      if (count === 0) {
        eventNames.push(names);
        document.getElementById("events").innerHTML = "Added successfully";
      } else {
        document.getElementById("events").innerHTML =
          "Already exists. Try with someother name.";
      }
    }
  }
  document.getElementById("resulth3").innerHTML = "";
  document.getElementById("eventsList").innerHTML = "";
  document.getElementById("label").innerHTML = "";
  document.getElementById("input").value = "";
  displaycount++;
}
function popElements() {
  displaycount = 0;
  document.getElementById("resulth3").innerHTML = "";
  document.getElementById("eventsList").innerHTML = "";
  document.getElementById("label").innerHTML = "";
  document.getElementById("input").value = "";
  if (eventNames.length === 0) {
    document.getElementById("events").innerHTML = "Event Array is Empty.";
  } else {
    eventNames.pop();
    document.getElementById("events").innerHTML = "Removed Successfully";
  }
  displaycount++;
}
function display() {
  if (displaycount > 0) {
    if (document.getElementById("input").value === "") {
      document.getElementById("input").innerHTML = "";
    }
    if (eventNames.length === 0) {
      document.getElementById("resulth3").innerHTML = "";
    } else {
      document.getElementById("resulth3").innerHTML =
        "The Events in the Array :";
      for (let i = 0; i < eventNames.length; i++) {
        document.getElementById("eventsList").innerHTML +=
          "<li>" + eventNames[i] + "</li>";
      }
    }
  }
  displaycount = 0;
}
document.getElementById("input").addEventListener("click", function () {
  document.getElementById("label").innerHTML = "Enter the Events";
  document.getElementById("events").innerHTML = "";
});
