package annotation.springmvc;

import org.springframework.stereotype.Repository;

@Repository("dao2")
public class PointDAO {
	int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
