package presentation;

import java.rmi.RemoteException;

import com.mum.seminar.SortingWSPortType;
import com.mum.seminar.SortingWSPortTypeProxy;

public class SortingApp implements SortingWSPortType {

	@Override
	public int[] sort(int[] arr) throws RemoteException {

		SortingWSPortType service = new SortingWSPortTypeProxy();

		return service.sort(arr);
	}

}
