package kr.or.bit.dao;

import java.util.ArrayList;
import java.util.HashMap;

import kr.or.bit.dto.checkList;

public interface CheckListDao {
	
	public void insertCheckList(HashMap<String,Object> checkListInfo);
	
	public int getLastCheckSeq();
	
	public ArrayList<checkList> loadCheckList(int cardSeq); 

	public void deleteChkList(int checkSeq);
	
	public void deleteChkListByCardSeq(int cardSeq);
	
	public void editCheckedStatus(checkList chk);
}
