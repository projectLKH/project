package com.pro.project.dao;

import com.pro.project.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleDao {

    public void updateWork(String cometime,int empno);
    public void updateWork2(int empno);
    public void updatego(String gotime,int empno);
    public void updatego2(int empno);


    public void resetworking(int empno);
    public void resetworking2(int empno);
    public String chul1(int empno);

    public Day typecheck(int empno, int month);

    public Working getlogininfo(int empno);

    public List<VacationDto> getVacationRequest(int deptno);

    public List<Dept>deptlist(int deptno);

    public void updatelastday(String today, int empno);

    public void updaterest(int empno);

    public void finishrest(int empno);

    public String checkisworking(int empno);

    public String checkvacation(String day,int empno);

    public void updatevacation(int empno);
    public void updatevacation2(int empno);

    public String getAuthority(int empno);

    public void updatetardy(int empno);

    public void checktardy(int empno,int month);

    public void updateworktime(int empno,int month);

    public void updateworkself(int worktime,int empno,int month);

    public String istardytoday(int empno);

    public void updateextrawork(int extratime,int empno, int month);

    public int getDeptNo(int empno);

    public void resetall();

    public void resetall2();

    public VacationDto getvacationone(int id);

    public void updateDayVacation(String day,int empno, int month,String which);

    public void deleteVacationRequest(int id);

    public void halftime(String day,int empno, int month, String half);

    public void resettardy(int empno);

    public List<DeptResult> getdeptinfo(int deptno);

    public String getjob(int empno);

    public void requestextra(int empno);

    public String isextratoday(int empno);

    public void insertnotice(String title, String content, int deptno);


    public List<Notice> getdeptNotice (int deptno);

    public Notice getdeptNotice2(int id);
}
