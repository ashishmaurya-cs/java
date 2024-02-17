function validate()
          {
            var teamno = document.getElementById("TeamNo").value;
            if(teamno == "Team2")
            {
                alert("Login Successful");
            window.location.href = "seleniumTesting2 - Home.html";
                return true;
            }
            else
            {
                alert("Login Unsuccessful");
                return false;
            }
          }