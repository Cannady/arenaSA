package arenaPrototypeB;


import java.util.HashMap;

public abstract class User {
    public HashMap<String, String> viewsByRole = new HashMap<>();

    public User(){

        //fill the view map on initialization
        loadViewsMap();
    }

    //requires all subclasses of User to have a method to fill the view map
    public  abstract void loadViewsMap();


    //Get view by type(?) - "home", "settings", etc.
    public String getView(String view){
        return viewsByRole.get(view);
    }

}
