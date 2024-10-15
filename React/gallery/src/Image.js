import tree_image from './images/tree.png';
import './Image.css';

function Image() {
    return (
      <img className='Gallery-image' src={tree_image} alt="tree" />
    );
  }

export default Image;