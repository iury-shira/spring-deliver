import './styles.css';
import StepsHeader from './StepsHeader';
import ProductsList from './ProductsList';
import { useEffect, useState } from 'react';
import { Product } from './types';
import { fetchProducts } from './api';

function Orders () {

    const[prdoducts, setProducts] = useState<Product[]>([]);

    useEffect(
        () => {
            fetchProducts()
                .then(response => setProducts(response.data))
                .catch(error => console.log(error))
        },
        []
    );

    return(
        <div className="orders-container">
            <StepsHeader />
            <ProductsList products={prdoducts}/>
        </div>
    );
}

export default Orders;