package edu.kh.shopping.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import edu.kh.shopping.model.dto.Shopping;
import edu.kh.shopping.model.service.ShoppingListService;
import edu.kh.shopping.model.service.ShoppingListServiceImpl;

public class ShoppingListView {

	private BufferedReader br = null;
	private ShoppingListService service = null;
	
	public ShoppingListView() {
		
		try {
			
			service = new ShoppingListServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

	//----------------------------------------------------------
	
	public void startView(){
		
		int input = 0; 
		
		do {
			
			try {
				
				input = selectMenu();
				
				switch(input) {
				case 1 : ShoppingList(); break;
				case 2 : ShoppingDetailView(); break;
				case 3 : productAdd(); break;
				case 4 : wish(); break;
				case 5 : productDelete(); break;
				case 0 : System.out.println("----프로그램 종료----");
				default : System.out.println("메뉴 작성된 번호만 입력해 주세요");
				
				}
				
				System.out.println("===============================================");
				
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요");
				input = -1;
			}catch(IOException e) {
				System.out.println("입/출력 관련 예외발생");
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(input != 0);
		
		
		
		
		
	}
	
	public int selectMenu() throws NumberFormatException, IOException{
		
		System.out.println("\n ------------Shopping---------------\n");
		
		System.out.println("1.Shopping List");
		System.out.println("2.Shopping Detail view");
		System.out.println("3.product add");
		System.out.println("4.wish");
		System.out.println("5.product delete ");
		System.out.println("0.EXIT");
		
		System.out.print("select menu >>>");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
	}
	
	public void ShoppingList() {
		System.out.println("\n ---------<1.Shopping List>--------- \n");
		
		Map<String,Object> map = service.ShoppingList();
		
		List<Shopping> ShoppingList = (List<Shopping>map.get(ShoppingList));
		int completeCount = (int)map.get(completeCount);
		
		System.out.printf("[ wish 개수 / 전체 상품 : %d / %d ]\n"
				, completeCount, ShoppingList.size());
		
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %10s   %10s     %s\n", "인덱스","찜하기", "상품");
		System.out.println("--------------------------------------------------------------------");
		
		for(int i=0, len = ShoppingList.size(); i < len; i++) {
		
			String title = ShoppingList.get(i).getTitle();
			
			String completeYN = ShoppingList.get(i).isComplete() ? "O" : "X";
			
			System.out.printf("[%3d]  %20s    (%s)       %s\n", i, completeYN, title);		
	}
}
	
	
	
	
	
	public void ShoppingDetailView() throws IOException{
		System.out.println("\n ---------<2.Shopping Detail View>--------- \n");
		
		System.out.print("인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		String ShoppingDetail = service.ShoppingDetailView(index);
		
		if(ShoppingDetail == null){
			System.out.println("입력한 인덱스 번호가 존재하지 않습니다");
			return;
		}
		System.out.println(ShoppingDetail);
		
	}
	
	public void productAdd() throws IOException, Exception {
		System.out.println("\n ---------<3.productAdd>--------- \n");
		
		System.out.println("추가할 상품 입력 : ");
		String title = br.readLine();
		
		System.out.println("상품 설명 추가( 입력 종료시 !e 작성)");
		System.out.println("---------------------------------------");
		
		StringBuilder sb = new StringBuilder();
		
		While(true){
			
			String content = br.readLine();
			
			if(content.equals("!e")) break;
			
			sb.append(content);
			sb.append("\n");	
		}
		
		System.out.println("-------------------------------------------");
		
		int index = service.ShoppingAdd(title, sb.toString());
		
		if(index == -1) {
			System.out.println("추가 실패");
			return;
		}
		System.out.printf("[%d] 인덱스에 추가 되었습니다 \n", index);
		
	}
	
	
	public void wish() throws IOException, Exception{
		
		System.out.println("\n ---------<4.wish>--------- \n");
		
		System.out.print("찜할 상품 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		boolean result = service.ShoppingComplete(index);
		
		if(result) {
			System.out.println("찜 완료!");
		}else {
			System.out.println("상품이 존재하지 않습니다");
		}
		
	}
	
	
	public void productDelete() throws Exception {
		 
		System.out.println("\n ---------<5.product Delete>--------- \n");
		
		System.out.print("삭제할 상품 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		String result = service.productDelete(index);
		
		if(result == null) System.out.println("상품이 존재하지 않습니다");
		else System.out.printf("[%s]가 목록에서 삭제되었습니다", result);
		
		
	}
	
}
