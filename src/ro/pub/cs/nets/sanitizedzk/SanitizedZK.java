package ro.pub.cs.nets.sanitizedzk;

import java.io.IOException;
import java.util.List;
import org.apache.zookeeper.AsyncCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Stat;

public class SanitizedZK extends ZooKeeper
{
	public SanitizedZK(String connectString, int sessionTimeout, Watcher watcher) throws IOException
	{
		super(connectString, sessionTimeout, watcher);
	}

	public SanitizedZK(String connectString, int sessionTimeout, Watcher watcher, boolean canBeReadOnly) throws IOException
	{
		super(connectString, sessionTimeout, watcher, canBeReadOnly);
	}

	public SanitizedZK(String connectString, int sessionTimeout, Watcher watcher, long sessionId, byte[] sessionPasswd) throws IOException
	{
		super(connectString, sessionTimeout, watcher, sessionId, sessionPasswd);
	}

	public SanitizedZK(String connectString, int sessionTimeout, Watcher watcher, long sessionId, byte[] sessionPasswd, boolean canBeReadOnly) throws IOException
	{
		super(connectString, sessionTimeout, watcher, sessionId, sessionPasswd, canBeReadOnly);
	}

	@Override
	public void sync(String path, AsyncCallback.VoidCallback cb, Object ctx)
	{
		super.sync(ZKPathSanitizer.sanitize(path), cb, ctx);
	}

	@Override
	public void getChildren(String path, boolean watch, AsyncCallback.Children2Callback cb, Object ctx)
	{
		super.getChildren(ZKPathSanitizer.sanitize(path), watch, cb, ctx);
	}

	@Override
	public void getChildren(String path, Watcher watcher, AsyncCallback.Children2Callback cb, Object ctx)
	{
		super.getChildren(ZKPathSanitizer.sanitize(path), watcher, cb, ctx);
	}

	@Override
	public List<String> getChildren(String path, boolean watch, Stat stat) throws KeeperException, InterruptedException
	{
		return super.getChildren(ZKPathSanitizer.sanitize(path), watch, stat);
	}

	@Override
	public List<String> getChildren(String path, Watcher watcher, Stat stat) throws KeeperException, InterruptedException
	{
		return super.getChildren(ZKPathSanitizer.sanitize(path), watcher, stat);
	}

	@Override
	public void getChildren(String path, boolean watch, AsyncCallback.ChildrenCallback cb, Object ctx)
	{
		super.getChildren(ZKPathSanitizer.sanitize(path), watch, cb, ctx);
	}

	@Override
	public void getChildren(String path, Watcher watcher, AsyncCallback.ChildrenCallback cb, Object ctx)
	{
		super.getChildren(ZKPathSanitizer.sanitize(path), watcher, cb, ctx);
	}

	@Override
	public List<String> getChildren(String path, boolean watch) throws KeeperException, InterruptedException
	{
		return super.getChildren(ZKPathSanitizer.sanitize(path), watch);
	}

	@Override
	public List<String> getChildren(String path, Watcher watcher) throws KeeperException, InterruptedException
	{
		return super.getChildren(ZKPathSanitizer.sanitize(path), watcher);
	}

	@Override
	public void setACL(String path, List<ACL> acl, int version, AsyncCallback.StatCallback cb, Object ctx)
	{
		super.setACL(ZKPathSanitizer.sanitize(path), acl, version, cb, ctx);
	}

	@Override
	public Stat setACL(String path, List<ACL> acl, int version) throws KeeperException, InterruptedException
	{
		return super.setACL(ZKPathSanitizer.sanitize(path), acl, version);
	}

	@Override
	public void getACL(String path, Stat stat, AsyncCallback.ACLCallback cb, Object ctx)
	{
		super.getACL(ZKPathSanitizer.sanitize(path), stat, cb, ctx);
	}

	@Override
	public List<ACL> getACL(String path, Stat stat) throws KeeperException, InterruptedException
	{
		return super.getACL(ZKPathSanitizer.sanitize(path), stat);
	}

	@Override
	public void setData(String path, byte[] data, int version, AsyncCallback.StatCallback cb, Object ctx)
	{
		super.setData(ZKPathSanitizer.sanitize(path), data, version, cb, ctx);
	}

	@Override
	public Stat setData(String path, byte[] data, int version) throws KeeperException, InterruptedException
	{
		return super.setData(ZKPathSanitizer.sanitize(path), data, version);
	}

	@Override
	public void getData(String path, boolean watch, AsyncCallback.DataCallback cb, Object ctx)
	{
		super.getData(ZKPathSanitizer.sanitize(path), watch, cb, ctx);
	}

	@Override
	public void getData(String path, Watcher watcher, AsyncCallback.DataCallback cb, Object ctx)
	{
		super.getData(ZKPathSanitizer.sanitize(path), watcher, cb, ctx);
	}

	@Override
	public byte[] getData(String path, boolean watch, Stat stat) throws KeeperException, InterruptedException
	{
		return super.getData(ZKPathSanitizer.sanitize(path), watch, stat);
	}

	@Override
	public byte[] getData(String path, Watcher watcher, Stat stat) throws KeeperException, InterruptedException
	{
		return super.getData(ZKPathSanitizer.sanitize(path), watcher, stat);
	}

	@Override
	public void exists(String path, boolean watch, AsyncCallback.StatCallback cb, Object ctx)
	{
		super.exists(ZKPathSanitizer.sanitize(path), watch, cb, ctx);
	}

	@Override
	public void exists(String path, Watcher watcher, AsyncCallback.StatCallback cb, Object ctx)
	{
		super.exists(ZKPathSanitizer.sanitize(path), watcher, cb, ctx);
	}

	@Override
	public Stat exists(String path, boolean watch) throws KeeperException, InterruptedException
	{
		return super.exists(ZKPathSanitizer.sanitize(path), watch);
	}

	@Override
	public Stat exists(String path, Watcher watcher) throws KeeperException, InterruptedException
	{
		return super.exists(ZKPathSanitizer.sanitize(path), watcher);
	}

	@Override
	public void delete(String path, int version, AsyncCallback.VoidCallback cb, Object ctx)
	{
		super.delete(ZKPathSanitizer.sanitize(path), version, cb, ctx);
	}

	@Override
	public void delete(String path, int version) throws InterruptedException, KeeperException
	{
		super.delete(ZKPathSanitizer.sanitize(path), version);
	}

	@Override
	public void create(String path, byte[] data, List<ACL> acl, CreateMode createMode, AsyncCallback.StringCallback cb, Object ctx)
	{
		super.create(ZKPathSanitizer.sanitize(path), data, acl, createMode, cb, ctx);
	}

	@Override
	public String create(String path, byte[] data, List<ACL> acl, CreateMode createMode) throws KeeperException, InterruptedException
	{
		return super.create(ZKPathSanitizer.sanitize(path), data, acl, createMode);
	}
}
