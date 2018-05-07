import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Rollercoaster> rollercoasters;
    private ArrayList<Dodgems> dodgemslist;

    public ThemePark(){
        this.rollercoasters = new ArrayList<>();
        this.dodgemslist = new ArrayList<>();
    }

    public int getRollercoastersInThemePark() {
        return rollercoasters.size();
    }

    public void addRollerCoasterToPark(Rollercoaster rollercoaster){
        rollercoasters.add(rollercoaster);
    }

}
