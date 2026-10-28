  import javax.swing.J0ptionPane;
 

  public class Callscan {

     public static void displayTeam(String teamNumber) { 
        String message; 

        switch (teamnumber) {
            case "1690":
                message = "Team 1690 (Orbit)/nLocation: Binyamina, ISR/nFun Fact: World championship titles. ";
                break;
            case "1114":
                message = "Team 1114 (Simbotics)/nLocation: Ontario, CAN/nFun Fact: Pop culture impact. ";
                break;
            case "971": 
                message = "Team 971  (Spartan Robotics)/nLocation: Mountain view, CA/nFun Fact: Virtual enviroment simulations. ";
                break;
            default:
            message = "Team " + teamNumber + " not found in the system. Try 1690, 1114, or 971. ";
                break; 
          } 
          
          J0ptionPane.showmessageDialog(null, message, "FRC Team Lookup", J0ptionPane.INFORMATION_MESSAGE);
     }
  }
