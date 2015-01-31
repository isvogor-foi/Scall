package AllocatorMetamodel.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class Allocator_metamodelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Allocator_metamodelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem> result = new ArrayList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							AllocatorMetamodel.diagram.edit.parts.SystemEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup) {
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup group = (AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) {
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem navigatorItem = (AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getVisualID(view)) {

		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID: {
			LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem> result = new LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup links = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_System_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID: {
			LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem> result = new LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID: {
			LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem> result = new LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID: {
			LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem> result = new LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup incominglinks = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_SWNode_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup outgoinglinks = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_SWNode_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SWNodeSWResourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID: {
			LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem> result = new LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup incominglinks = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_HWNode_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup outgoinglinks = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_HWNode_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HWNodeHWResourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID: {
			LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem> result = new LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup target = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_HWLink_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup source = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_HWLink_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID: {
			LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem> result = new LinkedList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup target = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_SWLink_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup source = new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup(
					AllocatorMetamodel.diagram.part.Messages.NavigatorGroupName_SWLink_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
							.getType(AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return AllocatorMetamodel.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem> result = new ArrayList<AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem) {
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem abstractNavigatorItem = (AllocatorMetamodel.diagram.navigator.Allocator_metamodelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
