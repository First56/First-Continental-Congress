package api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import data.FederalBillEntity;
import facade.GovTrackFacade;

@RestController
public class FederalBillController {

	@Autowired
	private GovTrackFacade govTrackFacade;
	
	@RequestMapping("/federal/bill")
	public FederalBillEntity federalBill(@RequestParam(value="id") Long id) throws IOException {
		return govTrackFacade.getBill(id);
	}
}
