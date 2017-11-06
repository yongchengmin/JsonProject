package com.hk13a.model;

public class PersonModel
{

	private int UserId;
	private String UserName;
	private String UserNick;
	private String UserPosition;
	private String UserAddress;
	private String UserEmail;
	private String UserQq;

	public PersonModel()
	{

	}

	public PersonModel(int userId, String userName, String userNick, String userPosition, String userAddress, String userEmail, String userQq)
	{
		super();
		UserId = userId;
		UserName = userName;
		UserNick = userNick;
		UserPosition = userPosition;
		UserAddress = userAddress;
		UserEmail = userEmail;
		UserQq = userQq;
	}

	/**
	 * Éú³ÉJson×Ö·û´®
	 */
	@Override
	public String toString()
	{
		return "PersonModel [UserId=" + UserId + ", UserName=" + UserName + ", UserNick=" + UserNick + ", UserPosition=" + UserPosition + ", UserAddress=" + UserAddress + ", UserEmail=" + UserEmail + ", UserQq=" + UserQq + "]";
	}

	public int getUserId()
	{
		return UserId;
	}

	public void setUserId(int userId)
	{
		UserId = userId;
	}

	public String getUserName()
	{
		return UserName;
	}

	public void setUserName(String userName)
	{
		UserName = userName;
	}

	public String getUserNick()
	{
		return UserNick;
	}

	public void setUserNick(String userNick)
	{
		UserNick = userNick;
	}

	public String getUserPosition()
	{
		return UserPosition;
	}

	public void setUserPosition(String userPosition)
	{
		UserPosition = userPosition;
	}

	public String getUserAddress()
	{
		return UserAddress;
	}

	public void setUserAddress(String userAddress)
	{
		UserAddress = userAddress;
	}

	public String getUserEmail()
	{
		return UserEmail;
	}

	public void setUserEmail(String userEmail)
	{
		UserEmail = userEmail;
	}

	public String getUserQq()
	{
		return UserQq;
	}

	public void setUserQq(String userQq)
	{
		UserQq = userQq;
	}
}