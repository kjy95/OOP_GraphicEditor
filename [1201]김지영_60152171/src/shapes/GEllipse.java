package shapes;
 
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import constants.GConstants.EDrawingType;

public class GEllipse extends GShape {

	private static final long serialVersionUID = 1L;
	private Ellipse2D.Double ellipse;
	public GEllipse() {
		super(EDrawingType.TP, new Ellipse2D.Double(0, 0, 0, 0));
		this.ellipse = ( Ellipse2D.Double)this.getShape();
	}
	public void setOrigin(int x, int y) {
		this.ellipse.setFrame(x, y, 0, 0);
	}
	public void setPoint(int x, int y) {
		this.px = x;
		this.py = y;
	}
	public void move(int x, int y) {
		this.ellipse.x += x - px;
		this.ellipse.y += y - py;
		this.setPoint(x, y);
	}
	public void addPoint(int x, int y) {
	}

	public void resize(int x, int y) {
		if (this.getCurrentEAnchor() == null) {
			this.ellipse.width = x - this.ellipse.x;
			this.ellipse.height = y - this.ellipse.y;
			return;
		}
		switch (this.getCurrentEAnchor()) {
		case NN:
			break;
		case NE:
			break;
		case NW:
			break;
		case SS:
			break;
		case SE:
			this.ellipse.width = x - this.ellipse.x;
			this.ellipse.height = y - this.ellipse.y;				
			break;
		case SW:
			break;
		case EE:
			break;
		case WW:
			break;
		default:
			break;
		}
		this.setPoint(x, y);
	}
}
