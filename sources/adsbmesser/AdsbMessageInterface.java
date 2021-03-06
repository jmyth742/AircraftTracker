package adsbmesser;

/**
 * Class contains data sent from an aircraft
 * @author Jonathan Smyth
 * */
public interface AdsbMessageInterface
{
	/**
	 * Returns Timestamp
	 * @return Timestamp
	 * */
	public String getTimestamp();

	/**
	 * Returns Messagetype
	 * @return Type
	 * */
	public int getType();

	/**
	 * Returns ICAO
	 * @return ICAO
	 * */
	public String getIcao();

	/**
	 * Returns DownlinkFormat
	 * @return DownlinkFormat
	 * */
	public int getDownlinkFormat();

	/**
	 * Returns Capability
	 * @return capability
	 * */
	public int getCapability();
}
