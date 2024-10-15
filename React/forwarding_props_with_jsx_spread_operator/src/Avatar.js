import getImageUrl from './utils.js';
import './Avatar.css';

function Avatar({person, size, isSepia, thickBorder}) {

    return (
        <img
            className={
                (isSepia && thickBorder) ? "avatar sepia thickBorder" 
                    : isSepia ? "avatar sepia"
                    : thickBorder ? "avatar thickBorder"
                    : "avatar"
            }
            src={getImageUrl(person)}
            alt={person.name}
            width={size}
            height={size}
        />
    );
}

export default Avatar;