ObservableList<String> data = FXCollections.emptyObservableList();
        data.addListener((ListChangeListener<? super String>) l->{
            while(l.next()){
                System.out.println(l.getAddedSubList());
            }
        });
        IntStream.range(0, 1000).mapToObj(Integer::toString).forEach(data::add);

        FilteredList<String> filteredData = new FilteredList<>(data, s -> Integer.valueOf(s)%2==0);
    
