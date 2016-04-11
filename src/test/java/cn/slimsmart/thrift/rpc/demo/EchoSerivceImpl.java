package cn.slimsmart.thrift.rpc.demo;

import org.apache.thrift.TException;

/**
 * Thrift接口定义的实现类,用于具体业务的实现
 */
public class EchoSerivceImpl implements EchoSerivce.Iface {

	@Override
	public String echo(String msg) throws TException {
		return "server :"+msg;
	}
}
