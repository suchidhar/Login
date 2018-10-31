package com.dev.beans;

public class UserAuth {
	private int attempts;
	private boolean lock;
	private long lockedtime;
	
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public boolean isLock() {
		return lock;
	}
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	public long getLockedtime() {
		return lockedtime;
	}
	public void setLockedtime(long lockedtime) {
		this.lockedtime = lockedtime;
	}
	
	@Override
	public String toString() {
		return "UserAuth [attempts=" + attempts + ", lock=" + lock + ", lockedtime=" + lockedtime + "]";
	}
	

}
