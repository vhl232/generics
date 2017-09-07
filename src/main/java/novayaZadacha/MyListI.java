package novayaZadacha;

public interface MyListI<D> {
    /**
     * Возвращает размер списка
     * @return целое число означающее размер списка
     */
    int size();

    /**
     * Проверяет пустой ли список
     * @return true если в списке нет элементов, false во всех остальных случаях
     */
    boolean isEmpty();

    /**
     * Проверяет содержится ли в списке элемент
     * @param o элемент, наличие которого проверяется
     * @return true если элемент найден и false во всех остальных случаях
     */
    boolean contains(Object o);

    /**
     * Добавляет в конец списка элемент
     * @param element элемент для добавления
     */
    void add(D element);

    /**
     * Добавляет элемент в список на указанную позицию
     * @param index позиция куда поместить элемент
     * @param element элемент для добавления
     */
    void add(int index, D element);

    /**
     * Помещает элемент в список на определенную позицию, заменяя прежний элемент на этой позиции
     * @param index позиция в списке
     * @param element элемент для помещения в список
     * @return прежний элемент на указанной позиции
     */
    D set(int index, D element);

    /**
     * Возвращает элемент с определенной позиции
     * @param index индекс элемента в списке (его опозиция)
     * @return элемент из списка
     */
    D get(int index);

    /**
     * Удаляет элемент из списка с определенной позиции
     * @param index индекс элемента в списке (его опозиция)
     * @return удаленный элемент
     */
    D remove(int index);

    /**
     * Удаляет первый найденый элемент из списка (если там такой присутствует)
     * @param o элемент для удаления
     * @return true если элемент найден (и удален), false во всех остальных случаях
     */
    boolean remove(Object o);

    /**
     * Очищает список, удаляя из него все элементы
     */
    void clear();

    /**
     * Возвращает индекс в списке первого найденого переданного элемента, если такой присутствует
     * @param o элемент для поиска
     * @return индекс элемента в списке
     */
    int indexOf(Object o);

    /**
     * Возвращает индекс в списке последнего найденого переданного элемента, если такой присутствует
     * @param o элемент для поиска
     * @return индекс элемента в списке
     */
    int lastIndexOf(Object o);

    boolean equals(Object o);
    int hashCode();
}