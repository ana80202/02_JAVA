package edu.kh.shopping.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
				case 5 : productEdit(); break;
				case 6 : productDelete(); break;
				case 0 : System.out.println("----프로그램 종료----"); break;
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
		System.out.println("5.product Edit");
		System.out.println("6.product delete ");
		System.out.println("0.EXIT");
		
		System.out.print("select menu >>>");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
	}
	
	public void ShoppingList() {
		System.out.println("\n ---------<1.Shopping List>--------- \n");
		
		Map<String,Object> map = service.ShoppingList();
		
		List<Shopping> ShoppingList = (List<Shopping>)map.get("ShoppingList");
		int wishCount = (int)map.get("wishCount");
		
		System.out.printf("[ wish 개수 / 전체 상품 : %d / %d ]\n"
				, wishCount, ShoppingList.size());
		
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %10s    %s\n", "인덱스","찜하기", "상품");
		System.out.println("--------------------------------------------------------------------");
		
		for(int i=0, len = ShoppingList.size(); i < len; i++) {
		
			String product = ShoppingList.get(i).getProduct();
			
			String wishYN = ShoppingList.get(i).isWish() ? "♥" : "♡";
			
			System.out.printf("[%3d]  %10s      %s\n", i, wishYN, product);		
	}
}
	
	
	
	
	//상세 설명 보기
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
	
	//상품 추가
	public void productAdd() throws IOException, Exception {
		System.out.println("\n ---------<3.productAdd>--------- \n");
		
		System.out.print("추가할 상품 입력 : ");
		String title = br.readLine();
		
		System.out.println("브랜드 작성( 입력 종료시 !e 작성)");
		System.out.println("---------------------------------------");
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String content = br.readLine();
			
			if(content.equals("!e")) break;
			
			sb.append(content);
			sb.append("\n");
				
		}
		
		System.out.println("-------------------------------------------");
		
		int index = service.productAdd(title, sb.toString());
		
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
		
		boolean result = service.wish(index);
		
		if(result) {
			System.out.println("찜 완료!");
		}else {
			System.out.println("상품이 존재하지 않습니다");
		}
		
	}
	
	
	public void productDelete() throws Exception {
		 
		System.out.println("\n ---------<6.product Delete>--------- \n");
		
		System.out.print("삭제할 상품 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		String result = service.productDelete(index);
		
		if(result == null) System.out.println("상품이 존재하지 않습니다");
		else System.out.printf("[%s]가 목록에서 삭제되었습니다", result);
		
		
	}
	
	

	public void productEdit() throws Exception {
		System.out.println("\n ---------<5.productEdit>--------- \n");
		
		System.out.print("수정할 상품 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());

		String shoppingDetail = service.ShoppingDetailView(index);
		
		if( shoppingDetail == null) {
			System.out.println("### 상품이 존재하지 않음###");
			return;
		}
		
		
		System.out.println("@@@@@@@@[수정 전]@@@@@@@@");
		System.out.println( shoppingDetail);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		System.out.print("상품 입력 : ");
		String title = br.readLine();
		
		System.out.println("브랜드 작성( 입력 종료 시 !e 작성 후 엔터)");
		System.out.println("------------------------------------------------");
		
		StringBuilder sb =new StringBuilder();
		
		while(true) {
		
			String content = br.readLine();
			
			if(content.equals("!e")) break; 
			
			sb.append(content);
			sb.append("\n");
				
		}
		
		System.out.println("-------------------------------------------------");
		
	
		boolean result = service. productEdit(index,title,sb.toString());
		
		if(result) System.out.println("[수정 되었습니다]");
		else 	   System.out.println("###수정 실패###");
		
		
	}
	
		
	}
	
	

