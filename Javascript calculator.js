<!DOCTYPE html>
<html>
<body>

<h1>Simple Addition Calculator</h1>

<p>Enter two numbers to add :</p>

<form>
  Number 1:<br>
  <input type="number" id ="num1"><br>
  Number 2:<br>
  <input type="number" id ="num2"><br><br>
  <input type="submit" value="Submit"><br><br>
  Total:<br>
  <input type="number" id="sum" ><br>
</form>

<script>
var x = document.getElementById("num1");
var y = document.getElementById("num2");
var z = x + y;
document.getElementById("sum").innerHTML = z;
</script>

</body>
</html>