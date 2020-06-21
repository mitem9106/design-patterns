// Implemented by CricketData to communicate
// with observers
package observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void unregisterObserver(Observer o);
	public void notifyObservers();
}
