package co.com.chainpattern.handlerconcrete;

import java.math.BigDecimal;

import co.com.chainpattern.handler.IAprobador;
import co.com.chainpattern.logica.Solicitud;
import co.com.chainpattern.logica.Utils;

public class EjecutivoDeCuenta implements IAprobador {
	
	private IAprobador next;
	
	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}
	
	@Override
	public IAprobador getNext() {
		return next;
	}
	
	@Override
	public void solicitudPrestamos(Solicitud solicitud) throws Exception {
		if (solicitud.getMonto().compareTo(BigDecimal.ZERO) > 0 && solicitud.getMonto().compareTo(new BigDecimal(10000)) <= 0) {
			System.out.println("Lo manejo yo, el ejecutivo de cuenta");
			solicitud.setMailAprobador("juanc.pedrazad@konradlorenz.edu.co");
			Utils.enviarMail(solicitud);
		}else{
			next.solicitudPrestamos(solicitud);
		}
		
	}
	
}
