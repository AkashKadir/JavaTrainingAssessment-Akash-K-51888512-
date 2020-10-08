package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hcl.model.Emp;
import org.hcl.util.DBUtil;
import org.hcl.util.DbConstants;

public class EmpDaoImpl implements EmpDao {
	@Override
	public boolean insert(Emp e) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isInserted=false;
		try {
			con=DBUtil.getConnection(DbConstants.DRIVER, DbConstants.URL, DbConstants.UNAME, DbConstants.PWD);
			if(con!=null)
			{
				pst=con.prepareStatement("insert into emp(eno,name,address) values(?,?,?)");
				pst.setInt(1, e.getEno());
				pst.setString(2, e.getName());
				pst.setString(3, e.getAddress());
				int i=pst.executeUpdate();
				if(i>0)
					isInserted=true;
			}
			pst.close();
			con.close();
		} catch (Exception e2) {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return isInserted;
	}

	@Override
	public Emp get(int eno) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet resultSet=null;
		Emp e=null;
		try {
			con=DBUtil.getConnection(DbConstants.DRIVER, DbConstants.URL, DbConstants.UNAME, DbConstants.PWD);
			if(con!=null)
			{
				pst=con.prepareStatement("select eno,name,address from emp where eno=?");
				pst.setInt(1, eno);
				resultSet=pst.executeQuery();
				resultSet.next();
				e=new Emp(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return e;
	}

	@Override
	public List<Emp> getAll() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Emp> emps=new ArrayList<>();
		try {
			con=DBUtil.getConnection(DbConstants.DRIVER, DbConstants.URL, DbConstants.UNAME, DbConstants.PWD);
			if(con!=null)
			{
				st=con.createStatement();
				rs=st.executeQuery("select eno,name,address from emp");
				while(rs.next())
				{
					emps.add(new Emp(rs.getInt(1),rs.getString(2),rs.getString(3)));
				}
				st.close();
				con.close();
			}
		} catch (Exception e) {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return emps;
	}

	@Override
	public boolean delete(int eno) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean isDeleted=false;
		try {
			con=DBUtil.getConnection(DbConstants.DRIVER, DbConstants.URL, DbConstants.UNAME, DbConstants.PWD);
			if(con!=null)
			{
				pst=con.prepareStatement("delete from emp where eno=?");
				pst.setInt(1, eno);
				int i=pst.executeUpdate();
				if(i>0)
				{
					isDeleted=true;
				}
				con.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

}
