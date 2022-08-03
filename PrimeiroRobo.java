apackage aula;
import robocode.Robot;
/**
 * PrimeiroRobo - a robot by Marco Carvalho
 */
public class PrimeiroRobo extends Robot
{
	private double minimoY;
	private double maximoY;
	private double minimoX;
	private double maximoX;
	
	public void run() {
		out.println(getBattleFieldHeight());
		out.println(getBattleFieldWidth());
		out.println(getHeight());
		out.println(getWidth());
		out.println(getHeading());
		out.println(getX());
		out.println(getY());
		
		this.minimoX = getHeight();
		this.maximoX = getBattleFieldWidth() - getHeight();
		this.minimoY = getHeight();
		this.maximoY = getBattleFieldHeight() - getHeight();
		
		turnLeft(getHeading());
		ahead(maximoY - getY());
		turnLeft(90);
		

		// Laço principal do robo
		while(true) {
			ahead(getX() - this.minimoX);
			turnLeft(90);
			ahead(getY() - this.minimoY);
			turnLeft(90);
			ahead(this.maximoX - getX());
			turnLeft(90);
			ahead(this.maximoY - getY());
			turnLeft(90);
		}
	}
}