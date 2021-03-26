package hu.nive.ujratervezes.zarovizsga.housecup;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

  private JdbcTemplate jdbcTemplate;

  public HouseCup(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public int getPointsOfHouse(String housede) {
    return jdbcTemplate.queryForObject("SELECT SUM(points_earned) AS points_earned FROM house_points WHERE house_name = ?", new Object[] {housede},
            (rs, i) -> rs.getInt("points_earned"));
  }
}
