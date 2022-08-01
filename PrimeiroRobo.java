package aula;
import robocode.Robot;
/**
 * PrimeiroRobo - a robot by Marco Carvalho
 */
public class PrimeiroRobo extends Robot
{
	public void run() {
		out.println(getBattleFieldHeight());
		out.println(getBattleFieldWidth());
		out.println(getHeight());
		out.println(getWidth());
		out.println(getHeading());
		out.println(getX());
		out.println(getY());
		// Laço principal do robo
		while(true) {
			turnGunRight(360);
		}
	}
}
