package Abstract;

public interface BaseService<T> {
	void add(T T);
	void delete(T T);
	void update(T T);
}
