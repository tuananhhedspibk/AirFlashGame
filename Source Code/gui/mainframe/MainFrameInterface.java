package gui.mainframe;

import auxiliary.Auxiliary;
import gui.bulbcomponent.BulbComponent;
import gui.decoratecomponent.DecorateComponent;
import gui.fontcomponent.FontComponent;
import gui.line.Line;
import gui.makearrow.MakeArrow;
import gui.makemenu.MakeMenu;
import gui.makepane.MakePane;
import gui.resultcomponent.ResultComponent;
import gui.specialcomponent.SpecialComponent;
import gui.transportation.Transportation;
import javax.swing.JFrame;
import tokenizerfunc.TokenizerFunc;

public interface MainFrameInterface{

    public static final TokenizerFunc tkf = new TokenizerFunc();
    public static final JFrame frame = new JFrame("AirFlashGame");
    public static final MakePane makePane = new MakePane();
    public static final SpecialComponent specialComponent = new SpecialComponent();
    public static final FontComponent fontComponent = new FontComponent();
    public static final Auxiliary aux = new Auxiliary();
    public static final BulbComponent bulbComponent = new BulbComponent(makePane.pane, tkf);
    public static final DecorateComponent decorateComponent = new DecorateComponent(makePane.pane, tkf);
    public static final Line line = new Line(makePane.pane, tkf);
    public static final MakeArrow makeArrow = new MakeArrow(makePane.pane, tkf, aux);
    public static final Transportation transportation = new Transportation(makePane.pane, tkf);
    public static final ResultComponent resultComponent = new ResultComponent(makePane.pane, fontComponent, tkf);
    public static final MakeMenu makeMenu = new MakeMenu(specialComponent, makePane.pane, resultComponent, aux);

}
