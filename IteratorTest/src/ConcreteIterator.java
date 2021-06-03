class GameListIterator implements Iterator {
private GameListAggregate aggregate;
private int current;
public GameListIterator(GameListAggregate a){ this.aggregate = a; }
public void first() { current = 0; }
public void next() { current += 1; }
public boolean isDone() {
if (current >= aggregate.getNumberOfStock()) { return true; }
else { return false; }
}
public Object getItem() { return aggregate.getAt(current); }
}