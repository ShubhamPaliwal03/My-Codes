import product_image from './product_img.jpg';
import './Product.css';

function Product() {
    return (
        <div className="container">
            <div className="image-container">
                <img className="image" src={product_image} alt="product_image"/>
            </div>
            <div className="price">
                $1499
            </div>
            <div className="name">
                TCL FHD Android TV 32-inch
            </div>
        </div>
    );
}

export default Product;