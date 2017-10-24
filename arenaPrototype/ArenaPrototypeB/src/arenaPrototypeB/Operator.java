package arenaPrototypeB;



public class Operator extends User{




    public void loadViewsMap(){
        //Key: view type || Value: specific view based on subclass's user role
        viewsByRole.put("home", "operatorMainPage.fxml");

        //just an example
        viewsByRole.put("settings", "OperatorSettings.fxml");
    }

}
