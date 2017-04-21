package com.liushao.redislockframework;


public interface SeckillInterface {
	@CacheLock(lockedPrefix="TEST_PREFIX")
	public void secKill(String arg1,@LockedObject Long arg2);

	@CacheLock(lockedPrefix="TEST_PREFIX2")
	public void secKillObj(@LockedComplexObject(field = "arg2")Goods goods);
}
