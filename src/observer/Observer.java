// This interface is implemented by all those
// classes that are to be update whenever there
// is an update from CricketData
package observer;

public interface Observer {
	public void update(int runs, int wickets, float overs);
}
