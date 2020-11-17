package day04;

public class CalculatorController {
	int execute(CalculatorDTO param) {
		CalculatorService service = new CalculatorService();
		int res = 0;
		String op = param.getOpcode();
		if(op.equals("+")) {
			res = service.add(param);
		}else if(op.equals("-")) {
			res = service.minus(param);		
		}else if(op.equals("*")) {
			res = service.multi(param);
		}else if(op.equals("/")) {
			res = service.divid(param);
		}else if(op.equals("%")) {
			res = service.modul(param);
		}
		return res;
	}
}
