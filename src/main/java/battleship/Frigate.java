/**
 * 
 */
package battleship;

public class Frigate extends Ship
{
    private static final int SIZE = 4;
    private static final String NAME = "Fragata";

    /**
     * @param bearing
     * @param pos
     */
    public Frigate(Compass bearing, IPosition pos) throws IllegalArgumentException
    {
	super(Frigate.NAME, bearing, pos);
	switch (bearing)
	{
	case NORTH, SOUTH:
	    for (int r = 0; r < SIZE; r++)
		positions.add(new Position(pos.getRow() + r, pos.getColumn()));
	    break;
	case EAST, WEST:
	    for (int c = 0; c < SIZE; c++)
		positions.add(new Position(pos.getRow(), pos.getColumn() + c));
	    break;
	default:
	    throw new IllegalArgumentException("ERROR! invalid bearing for thr frigate");
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see battleship.Ship#getSize()
     */
    @Override
    public int getSize()
    {
	return Frigate.SIZE;
    }

}
